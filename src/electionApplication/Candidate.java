package electionApplication;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private int candidateId;
    private String candidateName;
    private String position;
    private List<Candidate> candidates = new ArrayList<>();

    public Candidate (String candidateName, String position, int candidateId) {
        this.position = position;
        this.candidateName = candidateName;
        this.candidateId = candidateId;
    }
    public void addCandidate (Candidate candidate) {
        candidates.add(candidate);
    }

//    public int getCandidateId() {
//        return candidateId;
//    }
//    public String getCandidateName() {
//        return candidateName;
//    }
//    public void incrementVotes() {
//        votes++;
//    }

}
