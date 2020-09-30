package model.service;

import model.entity.Candidate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CandidateServiceImpl implements CandidateService {
    private static HashMap<String, Candidate> candidates;
    private static ArrayList<String> provinces;

    static {
        candidates = new HashMap<>();
        Candidate candidate = new Candidate("Nguyen", "2-1-2000", "Hue", "Hue", "0911", "nguyen@mail", "123", "student", "12/12", "Unknown", "address3", 1.75, 50, "music", "image", 1);
        candidates.put(candidate.getPersonalCode(), candidate);
    }
    static {
        provinces = new ArrayList<>();
        provinces.add("Ha Noi");
        provinces.add("TP HCM");
        provinces.add("Hue");
    }

    @Override
    public List<Candidate> findAll() {
        return new ArrayList<>(candidates.values());
    }

    @Override
    public void create(Candidate candidate) {
        candidates.put(candidate.getPersonalCode(), candidate);
    }

    @Override
    public void update(Candidate candidate) {
        candidates.put(candidate.getPersonalCode(), candidate);
    }

    @Override
    public void delete(Candidate candidate) {
        candidates.put(candidate.getPersonalCode(), candidate);
    }

    @Override
    public Candidate findByID(String id) {
        Candidate candidate = candidates.get(id);
        return candidate;
    }
}
