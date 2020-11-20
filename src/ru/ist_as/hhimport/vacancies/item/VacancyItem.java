package ru.ist_as.hhimport.vacancies.item;

import java.util.ArrayList;

public class VacancyItem {
    private String id;//
    private boolean premium;
    private String name;//
    private String department = null;
    private boolean has_test;
    private boolean response_letter_required;
    Area AreaObject;
    Salary SalaryObject;//
    Type TypeObject;
    Address AddressObject;
    private String response_url = null;
    private String sort_point_distance = null;
    Employer EmployerObject;//
    private String published_at;//
    private String created_at;
    private boolean archived;
    private String apply_alternate_url;
    private String insider_interview = null;
    private String url;
    private String alternate_url;
    ArrayList< Object > relations = new ArrayList < Object > ();
    Snippet SnippetObject;
    private String contacts = null;
    Schedule ScheduleObject;
    ArrayList < Object > working_days = new ArrayList < Object > ();
    ArrayList < Object > working_time_intervals = new ArrayList < Object > ();
    ArrayList < Object > working_time_modes = new ArrayList < Object > ();
    private boolean accept_temporary;

    public VacancyItem() {
    }
// Getter Methods

    public String getId() {
        return id;
    }

    public boolean getPremium() {
        return premium;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean getHas_test() {
        return has_test;
    }

    public boolean getResponse_letter_required() {
        return response_letter_required;
    }

    public Area getArea() {
        return AreaObject;
    }

    public Salary getSalary() {
        return SalaryObject;
    }

    public Type getType() {
        return TypeObject;
    }

    public Address getAddress() {
        return AddressObject;
    }

    public String getResponse_url() {
        return response_url;
    }

    public String getSort_point_distance() {
        return sort_point_distance;
    }

    public Employer getEmployer() {
        return EmployerObject;
    }

    public String getPublished_at() {
        return published_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public boolean getArchived() {
        return archived;
    }

    public String getApply_alternate_url() {
        return apply_alternate_url;
    }

    public String getInsider_interview() {
        return insider_interview;
    }

    public String getUrl() {
        return url;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public Snippet getSnippet() {
        return SnippetObject;
    }

    public String getContacts() {
        return contacts;
    }

    public Schedule getSchedule() {
        return ScheduleObject;
    }

    public boolean getAccept_temporary() {
        return accept_temporary;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHas_test(boolean has_test) {
        this.has_test = has_test;
    }

    public void setResponse_letter_required(boolean response_letter_required) {
        this.response_letter_required = response_letter_required;
    }

    public void setArea(Area areaObject) {
        this.AreaObject = areaObject;
    }

    public void setSalary(Salary salaryObject) {
        this.SalaryObject = salaryObject;
    }

    public void setType(Type typeObject) {
        this.TypeObject = typeObject;
    }

    public void setAddress(Address addressObject) {
        this.AddressObject = addressObject;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }

    public void setSort_point_distance(String sort_point_distance) {
        this.sort_point_distance = sort_point_distance;
    }

    public void setEmployer(Employer employerObject) {
        this.EmployerObject = employerObject;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setApply_alternate_url(String apply_alternate_url) {
        this.apply_alternate_url = apply_alternate_url;
    }

    public void setInsider_interview(String insider_interview) {
        this.insider_interview = insider_interview;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlternate_url(String alternate_url) {
        this.alternate_url = alternate_url;
    }

    public void setSnippet(Snippet snippetObject) {
        this.SnippetObject = snippetObject;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void setSchedule(Schedule scheduleObject) {
        this.ScheduleObject = scheduleObject;
    }

    public void setAccept_temporary(boolean accept_temporary) {
        this.accept_temporary = accept_temporary;
    }
}

