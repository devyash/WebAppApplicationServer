package org.prateek.demoproject.demoproject.resources;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.prateek.demoproject.demoproject.model.Business;
import org.prateek.demoproject.demoproject.model.Review;
import org.prateek.demoproject.demoproject.service.ReviewService;

@Path("/review")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReviewResource {

	//ReviewResource
	ReviewService reviewService=new ReviewService();

	@GET
	@Path("/{reviewId}")
	public Review getBusiness(@PathParam("reviewId")String reviewId) throws SQLException{
		return reviewService.getReview(reviewId);
	}


}
