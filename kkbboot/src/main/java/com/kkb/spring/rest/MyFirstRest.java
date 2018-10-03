package com.kkb.spring.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.kkb.spring.aop.MyAnnoTest;
import com.kkb.spring.configuration.MyConfigurationObj;
import com.kkb.xyz.ExecuteV4;
import com.kkb.xyz.IExecute;
import com.kkb.xyz.PersonManager;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestScope
public class MyFirstRest {

    @Autowired
    private MyConfigurationObj myConf;

    @Autowired
    private PersonManager      pm;

    @Autowired(required = false)
    //@Qualifier("v3")
    @ExecuteV4
    private IExecute           test;

    // @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @MyAnnoTest(testStr = "test")
    @GetMapping("/hello")
    //@PreAuthorize("hasRole('ADMIN')")
    public String hello(final Credential credentialParam) {
        return "Hello " + this.pm.getName();
    }

    @GetMapping("/conf")
    @PreAuthorize("hasRole('ADMIN')")
    public String conf() {

        return this.myConf.toString();
    }

    @GetMapping("/execute")
    public String execute() {
        return this.test.execute();
    }

    @GetMapping("/test/{isim}/{soyisim}")
    @ApiResponses({
                    @ApiResponse(code = 427, message = "Test api response")
    })
    public String test1(@PathVariable("isim") final String name,
                        @PathVariable("soyisim") final String surname,
                        @RequestParam("yas") final int age,
                        @RequestParam("telefon") final String phone,
                        @RequestHeader("abc") final String dep,
                        final HttpServletRequest req,
                        final HttpServletResponse res) {
        return "Hello " + name + " " + surname + " " + age + " phone : " + phone + " dep : " + dep;
    }

    @PostMapping(value = "/test2",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Employee test2(@Validated @RequestBody final Employee emp) {
        return emp;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleMethodArgumentNotValidException(final MethodArgumentNotValidException value) {
        ErrorObj errorObjLoc = new ErrorObj();
        List<ObjectError> allErrorsLoc = value.getBindingResult()
                                              .getAllErrors();
        for (ObjectError objectErrorLoc : allErrorsLoc) {
            errorObjLoc.setMsg(objectErrorLoc.getDefaultMessage());
        }

        return errorObjLoc;
    }

    @PostMapping(value = "/test3",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Employee test3(@RequestBody final Employee emp) throws MyValidationException {
        if (emp.getName()
               .length() < 2) {
            throw new MyValidationException("2 den küçük olamaz");
        }
        return emp;
    }


    @ExceptionHandler(MyValidationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleExcp(final MyValidationException myValidationExceptionParam) {
        ErrorObj errorObjLoc = new ErrorObj();
        errorObjLoc.setMsg(myValidationExceptionParam.getMsg());
        return errorObjLoc;
    }

    @PostMapping(value = "/test4",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    @ApiResponses({
                    @ApiResponse(code = 444, message = "Error 1", response = ErrorObj.class)
    })
    @ApiOperation(value = "sum of description", notes = "Employee alır verir", response = Employee.class)
    public ResponseEntity<?> test4(@RequestBody final Employee emp) {
        if (emp.getName()
               .length() < 2) {
            ErrorObj errorObjLoc = new ErrorObj();
            errorObjLoc.setMsg("2 den küçük olamaz");
            ResponseEntity<ErrorObj> bodyLoc = ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                                             .body(errorObjLoc);
            return bodyLoc;
        }
        return ResponseEntity.ok(emp);

    }

}
