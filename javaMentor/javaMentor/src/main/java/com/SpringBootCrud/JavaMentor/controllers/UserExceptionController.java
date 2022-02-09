package com.SpringBootCrud.JavaMentor.controllers;

import com.SpringBootCrud.JavaMentor.Exceptions.ThisNameAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionController {
    @ExceptionHandler(value = ThisNameAlreadyExistsException.class)
    public ResponseEntity<Object> exception(ThisNameAlreadyExistsException exception) {
        return new ResponseEntity<>("Пользватель с таким именем уже существует", HttpStatus.NOT_FOUND);
    }
}

//    @ExceptionHandler(Exception.class)
//    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
//        logger.error("Request: " + req.getRequestURL() + " raised " + ex);
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", ex);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }
//}