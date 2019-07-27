package Controller;




import java.io.UnsupportedEncodingException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.util.Base64;




@RestController
@RequestMapping("/")
public class ServiceController {
	
	
	
	
	
	@PostMapping(value="/postdb",consumes=MediaType.TEXT_PLAIN_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String gettoken(@RequestBody String token) throws UnsupportedEncodingException
	{
		
	    
			 String payload=token.split("\\.")[1];
			  
			return	new String( Base64.decodeBase64(payload),"UTF-8");
			
	}
	
	
	
}
