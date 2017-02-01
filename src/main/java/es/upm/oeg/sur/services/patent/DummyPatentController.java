package es.upm.oeg.sur.services.patent;

import com.google.common.collect.ImmutableList;
import es.upm.oeg.sur.services.patent.model.Patent;
import es.upm.oeg.sur.services.patent.model.SearchQuery;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(value = "patent-api", description = "Search Patents", tags = "patent-api")
@RequestMapping("/patent-search")
public class DummyPatentController {

    @ApiOperation(value = "Returns a list of patents that match a given search query",
            notes = "This dummy service is only for testing. At the moment it sends the same hardcoded result for any set of keywords.")
    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody List<Patent> searchPatents(@RequestBody @ApiParam(name = "searchQuery", required = true) SearchQuery query) {

        //TODO input validation
        return getPatents();

    }

    private List<Patent> getPatents() {

        Patent p1 = new Patent();
        p1.setPatentId("US08309694");
        p1.setTitle("Recovery of lignin and water soluble sugars from plant materials");
        p1.setPublicationDate("20121113");
        p1.setInventors(new String[]{"Helene Belanger", "Ross L. Prestidge", "Tony James Lough ", "James D. Watson"});
        p1.setApplicant("Vertichem Corporation");
        p1.setApplicantLocation("USA");
        p1.setPatentOffice("USPTO");
        p1.setLink("http://www.google.com.na/patents/US8309694");
        p1.setPatentAbstract("In one aspect, a process for treating woody plant material is provided, the process involving contacting the plant material with a continuous flow of an aqueous ethanol solution at elevated temperature and pressure under conditions that promote extraction of ethanol-soluble lignin from the plant material and retention of hemicellulose sugars, xylose and cellulose in the treated plant material solids. In another aspect, a process for extracting hemicellulose sugars from lignin-depleted plant material solids is provided, the process involving contacting lignin-depleted plant material with water at elevated temperature and pressure under conditions that promote extraction of hemicellulose sugars from the plant material; and recovering hemicellulose sugars from the liquid mixture.");
        p1.setRanking(50);

        Patent p2 = new Patent();
        p2.setPatentId("US8309698");
        p2.setTitle("Expression vector suitable for expression of a coding sequence for gene therapy ");
        p2.setPublicationDate("20080214");
        p2.setInventors(new String[]{"Daekyung Koh", "Kyuhyun Lee", "Hyeon Lee ", "Seongtae Yun", "Eui-Cheol Jo"});
        p2.setApplicant("Mogam Biotechnology Research Institute");
        p2.setApplicantLocation("USA");
        p2.setPatentOffice("USPTO");
        p2.setLink("http://www.google.com.na/patents/US8309698");
        p2.setPatentAbstract("Provided is an expression vector for gene therapy having a novel combination of transcriptional regulatory elements, including a promoter, an enhancer, an intron, an untranslated region (UTR) and a locus control region (LCR). The expression vector enables sustained expression of a liver tissue-specific gene, and thus, can be effectively used for treating thrombosis, hemophilia, liver cancer, etc.");
        p2.setRanking(70);

        return ImmutableList.of(p1, p2);

    }
}
