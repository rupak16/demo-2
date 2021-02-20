package com.example.demo.gettopic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	@RequestMapping("/topic")
	public List<Topics> getAlltopics()
	{
		return topicservice.getAlltopics();
		
	}
	
	@RequestMapping("/topic/{id}")
	public Optional<Topics> getOnetopics(@PathVariable   String id)
	{
		return  topicservice.getOnetopics(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topics topic)
	{
		topicservice.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateTopic(@RequestBody Topics topic,@PathVariable   String id)
	{
		topicservice.updateTopic(topic,id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{id}")
	public void deleteTopic(@PathVariable   String id)
	{
		topicservice.deleteTopic(id);
	}

}
