package Candidates;

import java.util.List;

public interface Icandidate {
    boolean addCandidate(Candidate c1);
    void showCandidate(int id);
    void removeCandidate(int id);

    void modifyCandidate(int id);
    void evaluateCandidate();

    void listAllCandidates();



}
