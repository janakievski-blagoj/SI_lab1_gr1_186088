class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints = new ArrayList<>(){{
		add(10);
		add(8);
		add(6);
		add(7);
		add(9);
		add(5);
		add(10);
		add(4);
		add(6);
	}};

	//TODO constructor
	public Student(String index, String firstName, String lastName) {
                this.index = index;
                this.firstName = firstName;
                this.lastName = lastName;
        }

	//TODO seters & getters
    public String getIndex() {
                return this.index;
        }
    public String getFirstName() {
                return this.firstName;
        }
    public String getLastName() {
                return this.lastName;
        }

    public void setIndex(String index) {
                this.index = index;
        }
    public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
    public void setLastName(String lastName) {
                this.lastName = lastName;
        }




	public double getAverage() {
		//TODO
        float average;
        for(int i=0; i<labPoints.length; i++)
            average += labPoints[i];
        average = average * 1.0 / labPoints.length;
        return average;

	}

	public boolean hasSignature() {
		//TODO
        if(labPoints.length > 8)
            return true
        else return false

	}
}

