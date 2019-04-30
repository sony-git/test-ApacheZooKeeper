
public class MyZKClient {

	public static void main(String[] args) {
		MyZKClient myZKClient =  new MyZKClient();
		myZKClient.performConnection();
	}
	
	private void performConnection() {
		ZKManager zKManager =  new ZKManagerImpl();
		Object zNodeData = zKManager.getZNodeData("/MySecindZNode", true);
	}

}
