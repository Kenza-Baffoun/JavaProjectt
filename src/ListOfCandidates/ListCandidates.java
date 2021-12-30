package ListOfCandidates;

import Candidates.Candidate;
import Candidates.Icandidate;
import java.util.ArrayList;
import java.util.List;


public class ListCandidates implements Icandidate
{
    private static List<Candidate> lstCandidates=new ArrayList<>();




    @Override
    public boolean addCandidate(Candidate c1) {
        if(lstCandidates.contains(c1))
            return false;
        return lstCandidates.add(c1);
    }

    @Override
    public void showCandidate(int id) {

        int initialSize=lstCandidates.size();

        for (int i = 0; i < lstCandidates.size(); i++) {
            if (lstCandidates.get(i).getId()==id)
            {

                System.out.println(i);
            }

        }
        if(initialSize==lstCandidates.size()){
            System.out.println("Verify the ID. Candidate not found");
        }

    }

    @Override
    public void removeCandidate(int id) {
        int initialSize=lstCandidates.size();

        for (int i = 0; i < lstCandidates.size(); i++) {
            if (lstCandidates.get(i).getId()==id)
            {
                lstCandidates.remove(i);
                System.out.println("Candidate was successfully removed");
            }

        }
        if(initialSize==lstCandidates.size()){
            System.out.println("Verify the ID. Candidate not found");
        }

    }



    @Override
    public void modifyCandidate(int id) {
        int initialSize= lstCandidates.size();
        for(int i=0;i< lstCandidates.size();i++)

        {
            if (lstCandidates.get(i).getId()==id)
            {
                lstCandidates.set(id, new Candidate());
                System.out.println("Candidate was successfully modified");
            }
        }

        if(initialSize==lstCandidates.size()){
            System.out.println("Verify the ID. Candidate not found");
        }



    }

    public void evaluateCandidate(){
        for (Candidate x : lstCandidates)
        {
            x.DonnerNote();
        }
    }




    @Override
    public void listAllCandidates() {
        System.out.println("List of Candidates :");
        for(Candidate c1:lstCandidates) {
            System.out.println(c1);
        }

    }




}
