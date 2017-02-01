package es.upm.oeg.sur.services.patent.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="SearchQuery", description="Search query - the input of the patent search api.")
public class SearchQuery {

    @ApiModelProperty(value = "A set of keywords to search", required = true)
    private String[] keywords;

    @ApiModelProperty(value = "A patent office location filter")
    private String patentOffice;

    @ApiModelProperty(value = "Applicant filter")
    private String applicant;

    @ApiModelProperty(value = "Applicant location filter")
    private String applicantLocation;

    @ApiModelProperty(value = "A lower bound for the publication date", example = "20120101")
    private String dateFrom;

    @ApiModelProperty(value = "A upper bound for the publication date", example = "20161231")
    private String dateTo;

    @ApiModelProperty(value = "Inventor filter")
    private String inventor;

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getPatentOffice() {
        return patentOffice;
    }

    public void setPatentOffice(String patentOffice) {
        this.patentOffice = patentOffice;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getApplicantLocation() {
        return applicantLocation;
    }

    public void setApplicantLocation(String applicantLocation) {
        this.applicantLocation = applicantLocation;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}
