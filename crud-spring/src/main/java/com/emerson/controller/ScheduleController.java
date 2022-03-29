package com.emerson.controller;

import java.util.List;

import com.emerson.model.Schedule;
import com.emerson.repository.ScheduleRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/schedules")
@AllArgsConstructor
public class ScheduleController {

    private final ScheduleRepository scheduleRepository;

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public @ResponseBody List<Schedule> list() {
        return scheduleRepository.findAll();
    }

}
