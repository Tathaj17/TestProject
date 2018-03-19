package org.Tathagata.create.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.Tathagata.create.database.Database;
import org.Tathagata.create.model.MessegeModel;

public class MessageService {
	
	static private Map<Long, MessegeModel> msg= Database.getMessages();
	
	//List all the message
	
	public MessageService()
	{
		
		msg.put(1L, new MessegeModel(1,"Hello World","Tathagata"));
		msg.put(2L, new MessegeModel(2,"Hello Sikh","Mukherjee"));
	}
	
	public List<MessegeModel> getAllMessages()
	{
		return new ArrayList<MessegeModel>(msg.values());
	}
	public MessegeModel getMessage(long id)
	{
			return msg.get(id);
	}
	public MessegeModel addMessage(MessegeModel message)
	{
		message.setId(msg.size()+1);
		msg.put(message.getId(), message);
		return message;
		
	}
	
	public MessegeModel updateMessage(MessegeModel message)
	{
		if(message.getId()<=0)
		{
			return null;
		}
		msg.put(message.getId(), message);
		return message;
		
	}
	public MessegeModel removeMessage(long id)
	{
		return msg.remove(id);
	}

}
