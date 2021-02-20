package com.example.demo.gettopic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicrepo;


public List<Topics> getAlltopics()
{
	
	
//return 	topiclist;
	List<Topics> top=new ArrayList<>();
	topicrepo.findAll().forEach(top::add);
	return top;
}
public Optional<Topics> getOnetopics(String id)
{
//return topiclist.stream().filter(t->t.getId().equals(id)).findFirst().get();
	return topicrepo.findById(id);

}
public void addTopic(Topics tpoic)
{
//topiclist.add(tpoic);	
	topicrepo.save(tpoic);
}
public void updateTopic(Topics topic, String id) {
	// TODO Auto-generated method stub
	topicrepo.save(topic);
	
	
	
}
public void deleteTopic(String id)
{
	topicrepo.deleteById(id);

}
}
