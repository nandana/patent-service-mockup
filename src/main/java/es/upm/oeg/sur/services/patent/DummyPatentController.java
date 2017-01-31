package es.upm.oeg.sur.services.patent;

import com.google.common.collect.ImmutableList;
import es.upm.oeg.sur.services.patent.model.Patent;
import es.upm.oeg.sur.services.patent.model.PatentList;
import es.upm.oeg.sur.services.patent.model.SearchQuery;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@Api(value = "patents")
@RequestMapping("/patents")
public class DummyPatentController {

    @ApiOperation(value = "Returns a list of patents that match a given search query",
            notes = "This dummy service is only for testing. At the moment it sends the same hardcoded result for any set of keywords.", response = PatentList.class)
    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody PatentList searchPatents(@RequestBody @ApiParam(name = "searchQuery", required = true) SearchQuery query) {

        Patent patent1 = new Patent("1", "testPatent1", "Madrid", LocalDate.now());
        Patent patent2 = new Patent("2", "testPatent2", "Colombo", LocalDate.now());

        List<Patent> patents = ImmutableList.of(patent1, patent2);

        PatentList patentList = new PatentList();
        patentList.setPatents(patents);

        return patentList;

    }
}
