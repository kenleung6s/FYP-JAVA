import httplib.*;

public class DataStream {
	// A simple HTTP Wrapper that allows both HTTP get and post requests in Java as well as user specification of headers and cookies.
	HTTPRequest request = new HTTPRequest();

	// Server path
	String serverPath = "http://127.0.0.1/CUHKFYP/source/web/application/";
	//String serverPath = "http://fyp-kenleung6s.rhcloud.com/CUHKFYP/source/web/application/";

	/**
	 * Delete and clean the connection record that used before between sender and receiver
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String initConnection(int sender_id, int receiver_id) {
		String url = serverPath + "request.php?action=init";
		
		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id);	
		respond = respond.substring(0, respond.length() - 1);		
		return respond;
	}

	/**
	 * Establish first time connection in the database, create a new record iff didn't created before.
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String createConnection(int sender_id, int receiver_id) {
		String url = serverPath + "request.php?action=create";
		
		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id);	
		respond = respond.substring(0, respond.length() - 1);	
		return respond;
	}

	/**
	 * Get the data from database
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @return             server respond return corresponding data when success, FailMessage() when fail
	 */
	String getData(int sender_id, int receiver_id) {
		String url = serverPath + "request.php?action=get&type=data";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id);
		respond = respond.substring(0, respond.length() - 1);	
		return respond;
	}	

	/**
	 * Get the to_sender_mutex field value from database
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @return             server respond return corresponding data when success, FailMessage() when fail
	 */
	String getToSenderMutex(int sender_id, int receiver_id) {
		String url = serverPath + "request.php?action=get&type=to_sender_mutex";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id);
		respond = respond.substring(0, respond.length() - 1);	
		return respond;
	}

	/**
	 * Get the to_receiver_mutex field value from database
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @return             server respond return corresponding data when success, FailMessage() when fail
	 */
	String getToReceiverMutex(int sender_id, int receiver_id) {
		String url = serverPath + "request.php?action=get&type=to_receiver_mutex";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id);
		respond = respond.substring(0, respond.length() - 1);	
		return respond;
	}

	/**
	 * Send data to database server using POST requests
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @param  data        data
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String postData(int sender_id, int receiver_id, String data) {
		String url = serverPath + "request.php?action=post&type=data";
		
		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id+"&data="+data);	
		respond = respond.substring(0, respond.length() - 1);		
		return respond;
	}

	/**
	 * Update to_sender_mutex to database server using POST requests
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @param  value       0 or 1
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String postToSenderMutex(int sender_id, int receiver_id, int value) {
		String url = serverPath + "request.php?action=post&type=to_sender_mutex";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id+"&value="+value);
		respond = respond.substring(0, respond.length() - 1);
		return respond;
	}

	/**
	 * Update to_receiver_mutex to database server using POST requests
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @param  value       0 or 1
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String postToReceiverMutex(int sender_id, int receiver_id, int value) {
		String url = serverPath + "request.php?action=post&type=to_receiver_mutex";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id+"&value="+value);
		respond = respond.substring(0, respond.length() - 1);
		return respond;
	}

	/**
	 * Update the process status to database server using POST requests
	 * @param  sender_id   sender's id
	 * @param  receiver_id receiver's id
	 * @param  value       any integer
	 * @return             server respond return successMessage() when success, FailMessage() when fail
	 */
	String processUpdate(int sender_id, int receiver_id, int value) {
		String url = serverPath + "request.php?action=process";

		String respond = request.post(url, "sender_id="+sender_id+"&receiver_id="+receiver_id+"&value="+value);
		respond = respond.substring(0, respond.length() - 1);
		return respond;
	}

	/**
	 * Success message for database update
	 * @return success
	 */
	String successMessage() {
		return "/*success!*/";
	}

	/**
	 * Fail message for database update
	 * @return fail
	 */
	String failMessage() {
		return "/*fail!*/";
	}

}
