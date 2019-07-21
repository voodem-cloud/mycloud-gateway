/**
 * 
 */
package edu.san.mycloud.gateway.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author svoodem
 *
 */
@RestController
public class MycloudGatewayController {
	
	@GetMapping("/status")
	public String getStatus() {
		return "Welcome to Gateway!!!";
	}

}
