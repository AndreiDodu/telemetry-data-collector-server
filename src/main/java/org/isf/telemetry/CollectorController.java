package org.isf.telemetry;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectorController {

	@GetMapping("/")
	public String index() {
		return "Open Hospital data collector server. Make a post request in order to store some data.";
	}

	@PostMapping(value = "/collect")
	public Map<String, String> collect(@RequestBody Map<String, Map<String, String>> data) {
		// TODO store data somewhere
		Map<String, String> result = new HashMap<>();
		result.put("status", "true");
		return result;
	}

}
