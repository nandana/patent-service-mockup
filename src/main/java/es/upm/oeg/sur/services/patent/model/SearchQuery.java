package es.upm.oeg.sur.services.patent.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="SearchQuery", description="Search query - the input of the patent search api.")
public class SearchQuery {

    private String[] keywords;

    @ApiModelProperty(value = "A lower bound for the publication year", example = "2012")
    private int yearFrom;

    @ApiModelProperty(value = "A upper bound for the publication year", example = "2017")
    private int yearTo;

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public int getYearFrom() {
        return yearFrom;
    }

    public void setYearFrom(int yearFrom) {
        this.yearFrom = yearFrom;
    }

    public int getYearTo() {
        return yearTo;
    }

    public void setYearTo(int yearTo) {
        this.yearTo = yearTo;
    }
}
