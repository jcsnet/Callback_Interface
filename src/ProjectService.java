public class ProjectService extends AbstractService {

	// select()
	public static void main(String[] args) {
		inject();
		template(select());
	}
	
	// list()
	public static void list() {

		inject();

		//		List list
		//		
		//		List 2
		//		for () {
		//			template(select());
		//		}
		//		return list2
	}

	protected static Project newOne() {
		return new Project();
	}
	
	private static void inject() {

		transformer = new CallbackInterface() {

			@Override
			public void doSomething(Project project1, Project project2) {
				project2.setProjectName("zmieniony opis "
						+ project1.getProjectName());
			}
		};
	}
	
	private static void template(Project project1db) {
		Project project2 = newOne();
		transformer.doSomething(project1db, project2);
		System.out.println("Co zrobil transformer : " + project2);
	}

}
