package com.milind.bluegreenpoc.bluegreenpoc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @RequestMapping(value = "/getData", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String postjson()  {

        //return "From Blue Environment";
        return "From Green Environment";
    }


}
