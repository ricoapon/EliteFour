package com.apon.elitefour;

import com.apon.elitefour.database.tables.pojos.Status;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloControllerTest {

    @Autowired
    private DSLContext create;

    @Test
    public void happyFlow() {
        List<Status> statusList = create.selectFrom(com.apon.elitefour.database.tables.Status.STATUS).fetchInto(Status.class);

        assertEquals(3, statusList.size());
    }
}
