package com.lambdaschool.school.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public abstract class ControllerLoggerExtension {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    protected void Log(HttpServletRequest req){
        logger.info(req.getMethod() + " " + req.getRequestURI() + " Accessed");
    }
}
