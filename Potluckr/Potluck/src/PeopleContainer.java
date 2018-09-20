import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class PeopleContainer {
    public static ArrayList<Person> PeopleList = new ArrayList();
    public static ArrayList<PDate> dates = new ArrayList();
    public static ArrayList<PDate> overlap_dates = new ArrayList();

    public static void addPerson(Person P) {
        PeopleList.add(P);
    }

    public static void init_dates() {
        for(Person p: PeopleList) {
            for(PDate d : p.getAvailable()) {
                dates.add(d);
            }
        }
    }

    public static ArrayList<PDate> getDates() {
        return dates;
    }

    public static ArrayList<Person> getPeopleList() {
        return PeopleList;
    }

    public static ArrayList<PDate> schedule() {
        ArrayList<PDate> A = new ArrayList<>();
        Calendar rightNow = Calendar.getInstance();

        PDate now = new PDate(rightNow.get(Calendar.MONTH), rightNow.get(Calendar.DAY_OF_MONTH), rightNow.get(Calendar.HOUR_OF_DAY), rightNow.get(Calendar.MINUTE), 23, 59, false, rightNow.get(Calendar.YEAR));

        int num_ppl = PeopleList.size();

        Collections.sort(dates, new DateSortByMonth());

        DateSortByMonth comp = new DateSortByMonth();

        for (PDate d: dates) {
            if(comp.compare(now, d) == 1 ) {
                dates.remove(d);
            }
            else {
                break;
            }
        }

        int i = 0;
        int num_sets = 0;
        PDate temp;

        while(i < dates.size()) {
            DateSortByHourEnd comp_hour_end = new DateSortByHourEnd();
            // error is here
            if(A.isEmpty()) {
                A.add(dates.get(i));
                i++;
                num_sets = 1;
            }
            else {
                if(A.get(A.size()-1).getYear() == dates.get(i).getYear()) {
                    if(A.get(A.size()-1).getCalendar_s().get(Calendar.DAY_OF_YEAR) == dates.get(i).getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                        if (comp_hour_end.compare(A.get(A.size()-1), dates.get(i)) == -1){
                            temp = new PDate(dates.get(i).getMonth(), dates.get(i).getDay(), dates.get(i).getS_hour(), dates.get(i).getS_min(), A.get(A.size()-1).getE_hour(), A.get(A.size()-1).getE_min(), false, A.get(A.size()-1).getYear());
                            A.add(temp);
                            i++;
                            num_sets++;
                        }
                        else {
                            A.add(dates.get(i));
                            i++;
                            num_sets++;
                        }
                        if (num_ppl == num_sets) {
                            overlap_dates.add(A.get(A.size()-1));
                            i += 1;
                            if (i < dates.size()) {
                                A.set(A.size()-1, dates.get(i-1));
                                num_sets = 1;
                            }
                            else {
                                break;
                            }
                        }
                    }
                    else {
                        i += 1;
                        if (i < dates.size()) {
                            A.set(A.size()-1, dates.get(i-1));
                            num_sets = 1;
                        }
                        else {
                            break;
                        }
                    }
                }
                else {
                    i += 1;
                    if (i < dates.size()) {
                        A.set(A.size()-1, dates.get(i-1));
                        num_sets = 1;
                    }
                    else {
                        break;
                    }
                }
            }

        }
        return overlap_dates;
    }
    /*public static String[][] toArray() {
        String[][] peoples = new String[PeopleList.size()][3];
        for(int i = 0; i < PeopleList.size(); i++){
            peoples[i][0] = PeopleContainer.PeopleList.get(0).getName();
            peoples[i][1] = PeopleContainer.PeopleList.get(0).getAllergy().get(0).toString();
            peoples[i][2] = PeopleContainer.PeopleList.get(0).getDiet().toString();
        }
        return peoples;
    }*/

    public static ArrayList<String[]> DatetoArrayString(String[] month) {
        ArrayList<String[]> arr = new ArrayList<>();
        String[] temp = new String[2];
        PDate s = overlap_dates.get(0);
        PDate d;
        int i = 1;
        while (i < overlap_dates.size()) {
            d = overlap_dates.get(i);
            if (s.getCalendar_s().get(Calendar.DAY_OF_YEAR) == d.getCalendar_s().get(Calendar.DAY_OF_YEAR)) {
                temp[0] = "" + month[(s.getMonth()-1)] + " " + s.getDay() + " " + s.getYear();
                System.out.println(temp[0]);
                temp[1] = "" + time_toString(s.getS_hour()) + ':' + time_toString(s.getS_min()) + " to " + time_toString(s.getE_hour()) + ':' + time_toString(s.getE_min())
                        + time_toString(d.getS_hour()) + ':' + time_toString(d.getS_min()) + " to " + time_toString(d.getE_hour()) + ':' + time_toString(d.getE_min());
                System.out.println(temp[1]);
                while(s.getCalendar_s().get(Calendar.DAY_OF_YEAR) == d.getCalendar_s().get(Calendar.DAY_OF_YEAR) ) {
                    temp[1] = temp[1] + time_toString(d.getS_hour()) + ':' + time_toString(d.getS_min()) + " to " + time_toString(d.getE_hour()) + ':' + time_toString(d.getE_min());
                    System.out.println(temp[1]);
                    s = overlap_dates.get(i);
                    i++;
                    d = overlap_dates.get(i);
                }
                arr.add(temp);
            }
             else {
                temp[0] = "" + month[(s.getMonth()-1)] + " " + s.getDay() + " " + s.getYear();
                System.out.println(temp[0]);
                temp[1] = "" + time_toString(s.getS_hour()) + ':' + time_toString(s.getS_min()) + " to " + time_toString(s.getE_hour()) + ':' + time_toString(s.getE_min());
                System.out.println(temp[1]);
                arr.add(temp);
                s = overlap_dates.get(i);
                i++;
            }
        }
        if(arr.isEmpty()) {
            temp[0] = "" + month[(s.getMonth()-1)] + " " + s.getDay() + " " + s.getYear();
            System.out.println(temp[0]);

            temp[1] = "" + time_toString(s.getS_hour()) + ':' + time_toString(s.getS_min()) + " to " + time_toString(s.getE_hour()) + ':' + time_toString(s.getE_min());
            arr.add(temp);
        }
        return arr;
    }

    public static String time_toString(int time) {
        if (time < 10) {
            return "" + 0 + time;
        }
        return "" + time;
    }

    public static void main(String[] args) {
        PDate d0 = new PDate(9, 20, 9, 0, 20, 30, false, 2017);
        PDate d1 = new PDate(9, 20, 9, 0, 23, 59, true, 2017);
        PDate d2 = new PDate(9, 19, 9, 0, 23, 59, true, 2017);
        PDate d3 = new PDate(9, 19, 14, 0, 20, 59, false, 2017);

        Person p1 = new Person();
        Person p2 = new Person();
        p2.addAvailable(d0);
        p2.addAvailable(d3);
        p1.addAvailable(d1);
        p1.addAvailable(d2);

        addPerson(p2);
        addPerson(p1);

        init_dates();
        ArrayList<PDate> av_d = schedule();

        String[] monthStr = {"january", "february", "march", "april", "may", "june",
                "july", "august", "september", "october", "november",
                "december"};
        DatetoArrayString(monthStr);

    }

}