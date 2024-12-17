package electionApplication;

import electionApplication.exception.VoterIllegalException;

import java.util.ArrayList;
import java.util.List;

public class Voter {
    private int voterId;
    private String voterName;
    private String voterPassword;
    private boolean hasVoted;
    private List<Voter> voters = new ArrayList<>();


    public Voter(int voterId, String voterName, String voterPassword) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.voterPassword = voterPassword;

    }
    public void addVoter(Voter voter) {
        voters.add(voter);

    }
    public int getVoterId() {
        return voterId;
    }

    public String getVoterName() {
        return voterName;
    }
    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
    public boolean hasVoted() {
        return hasVoted;
    }
    public void vote(){
        if(!hasVoted) {
            hasVoted = true;
        } else {
            throw new VoterIllegalException("Voter has already been voted");
        }
    }


}
