package staffdetails;

public class Staff {
    String staffName, staffDesignation;
    int staffID;
    String[] sub = new String[]{"Maths", "OOPS", "Database System"};

    public Staff(String sn, int sid, String stdn) {
        staffName = sn;
        staffID = sid;
        staffDesignation = stdn;
    }

    public void show1() {
        System.out.println("Staff Name: " + staffName + " ID " + staffID + " with Designation " + staffDesignation + ". \nSubjects handled are ");
        for (int i = 0; i <= 2; i++) {
            System.out.println(sub[i] + " ");
        }
    }
}
