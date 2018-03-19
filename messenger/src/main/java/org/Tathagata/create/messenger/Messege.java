package org.Tathagata.create.messenger;


import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import javax.ws.rs.Produces;
import java.util.List;
import javax.ws.rs.core.MediaType;


import org.Tathagata.create.Service.MessageService;
import org.Tathagata.create.model.MessegeModel;

@Path("/messeges")
public class Messege {
	MessageService ms= new MessageService();
@GET
@Produces(MediaType.APPLICATION_XML)
public List<MessegeModel> getMesseges()
{
	
	return ms.getAllMessages();
}

@GET
@Path("/{mID}")
@Produces(MediaType.APPLICATION_XML)
public MessegeModel getMessage(@PathParam("mID") long mID)
{
	return ms.getMessage(mID);
	//return 2;
}
@POST
@Path("/{mID}")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public MessegeModel addMessage(MessegeModel msgModel)
{
	return ms.addMessage(msgModel);
}


@PUT
@Path("/{mID}")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public MessegeModel updateMessage(@PathParam("mID") long mID ,MessegeModel msgModel)
{
	msgModel.setId(mID);
	return ms.updateMessage(msgModel);
}


@DELETE
@Path("/{mID}")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public MessegeModel DeleteMessage(@PathParam("mID") long mID)
{
	
	return ms.removeMessage(mID);
}
}

