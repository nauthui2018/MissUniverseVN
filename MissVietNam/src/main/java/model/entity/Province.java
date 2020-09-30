package model.entity;

import java.util.List;

public class Province {
    private int code;
    private String name;
    private List<Candidate> candidates;

    public Province() {
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
