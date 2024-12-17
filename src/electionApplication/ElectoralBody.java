package electionApplication;

import java.util.ArrayList;
import java.util.List;

public class ElectoralBody {
    private int candidateId;
    private int voterId;
    private List<Voter>voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<Candidate>();

    public Candidate registerCandidates(String firstName, String lastName, String position ) {
        String name = firstName + " " + lastName;
        candidateId++;
        Candidate candidate = new Candidate(name, position, candidateId);
        candidates.add(candidate);
        return candidate;
    }
    public Voter registerVoters(String firstName, String lastName, String password ) {
        String name = firstName + " " + lastName;
        voterId++;
        Voter voter = new Voter(voterId, name, password);
            voters.add(voter);
            return voter;
        }

}

