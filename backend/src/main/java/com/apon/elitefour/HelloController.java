package com.apon.elitefour;

import com.apon.elitefour.database.tables.pojos.Status;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final DSLContext create;

    @Autowired
    public HelloController(DSLContext create) {
        this.create = create;
    }

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping("/status")
    public List<Status> getStatus() {
        return create.selectFrom(com.apon.elitefour.database.tables.Status.STATUS).fetchInto(Status.class);
    }
}
