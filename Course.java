class Course {
    List<Student> students = new ArrayList<Student>();

    public float totalAverage(){
        float average = 0;
        for (int i=0; i<students.length; i++){
            average += students[i].getAverage();
        }
        average = average*1.0 / students.length;
        return average;
    }

}
