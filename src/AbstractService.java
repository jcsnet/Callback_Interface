
public class AbstractService {
	
	//@Autowired
	protected static CallbackInterface transformer;

	protected static Project select() {
		Project project1db = new Project();
		project1db.setProjectName("Nowy projekt");
		return project1db;
	}
}
