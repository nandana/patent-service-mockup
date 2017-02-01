package es.upm.oeg.sur.services.patent.model;

import io.swagger.annotations.ApiModelProperty;


public class Patent {

    String patentId;

    @ApiModelProperty(value = "Title of the patent", example = "A cognitive technique to easily search patents")
    String title;

    @ApiModelProperty(value = "Publication date of the patent", example = "20120101")
    String publicationDate;

    @ApiModelProperty(value = "A list of inventors")
    String[] inventors;

    @ApiModelProperty(value = "Applicant of the patent", example = "Universidad Politécnica de Madrid")
    String applicant;

    @ApiModelProperty(value = "Location of the applicant", example = "ES")
    String applicantLocation;

    @ApiModelProperty(value = "Patent office", example = "Universidad Politécnica de Madrid")
    String patentOffice;

    @ApiModelProperty(value = "An external link to the patent", example = "http://www.google.com.na/patents/US00000000")
    String link;

    @ApiModelProperty(value = "Abstract of the patent", example = "This technique allows users to easily discover patents there are interested using" +
            " with the help of cognitive computing methods.")
    String patentAbstract;

    @ApiModelProperty(value = "A ranking based on search query context.", example = "50",
            allowableValues = "0..100")
    int ranking;

    public Patent() {

    }

    public Patent(String patentId, String title, String publicationDate, String[] inventors, String applicant,
                  String applicantLocation, String patentOffice, String link,  String patentAbstract, int ranking) {
        this.patentId = patentId;
        this.title = title;
        this.publicationDate = publicationDate;
        this.inventors = inventors;
        this.applicant = applicant;
        this.applicantLocation = applicantLocation;
        this.patentOffice = patentOffice;
        this.link = link;
        this.patentAbstract = patentAbstract;
        this.ranking = ranking;
    }


    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String[] getInventors() {
        return inventors;
    }

    public void setInventors(String[] inventors) {
        this.inventors = inventors;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getPatentOffice() {
        return patentOffice;
    }

    public void setPatentOffice(String patentOffice) {
        this.patentOffice = patentOffice;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPatentAbstract() {
        return patentAbstract;
    }

    public void setPatentAbstract(String patentAbstract) {
        this.patentAbstract = patentAbstract;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getApplicantLocation() {
        return applicantLocation;
    }

    public void setApplicantLocation(String applicantLocation) {
        this.applicantLocation = applicantLocation;
    }
}
