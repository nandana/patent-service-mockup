package es.upm.oeg.sur.services.patent.model;

import java.util.List;

public class PatentList {

    List<Patent> patents;

    public List<Patent> getPatents() {
        return patents;
    }

    public void setPatents(List<Patent> patents) {
        this.patents = patents;
    }
}
