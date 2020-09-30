package model.entity;

public class Candidate {
    private String name;
    private String dob;
    private String address1;
    private String address2;
    private String mobile;
    private String email;
    private String personalCode;
    private String job;
    private String education;
    private String ethnic;
    private String address3;
    private double height;
    private double weight;
    private String talent;
    private String image;
    private String qualify = "Waiting";
    private int code;
    Province province;

    public Candidate() {
    }

    public Candidate(String name, String dob, String address1, String address2, String mobile, String email, String personalCode, String job, String education, String ethnic, String address3, double height, double weight, String talent, String image, int code) {
        this.name = name;
        this.dob = dob;
        this.address1 = address1;
        this.address2 = address2;
        this.mobile = mobile;
        this.email = email;
        this.personalCode = personalCode;
        this.job = job;
        this.education = education;
        this.ethnic = ethnic;
        this.address3 = address3;
        this.height = height;
        this.weight = weight;
        this.talent = talent;
        this.image = image;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String getJob() {
        return job;
    }

    public String getEducation() {
        return education;
    }

    public String getEthnic() {
        return ethnic;
    }

    public String getAddress3() {
        return address3;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getTalent() {
        return talent;
    }

    public String getImage() {
        return image;
    }

    public int getCode() {
        return code;
    }

    public Province getProvince() {
        return province;
    }

    public String getQualify() {
        return qualify;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setQualify(String qualify) {
        this.qualify = qualify;
    }

    public void setAll(String name, String dob, String address1, String address2, String mobile, String email, String personalCode, String job, String education, String ethnic, String address3, double height, double weight, String talent, String image, int code) {
        this.name = name;
        this.dob = dob;
        this.address1 = address1;
        this.address2 = address2;
        this.mobile = mobile;
        this.email = email;
        this.personalCode = personalCode;
        this.job = job;
        this.education = education;
        this.ethnic = ethnic;
        this.address3 = address3;
        this.height = height;
        this.weight = weight;
        this.talent = talent;
        this.image = image;
        this.code = code;
    }
}
