package com.cg.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.ScheduledFlight;
@Repository
public interface ScheduleFlightDao  extends JpaRepository<ScheduledFlight,String >{
@Query("from ScheduledFlight where scheduledFlightId=:sid ")
	public ScheduledFlight getSchedule(@Param("sid") String schedulId);
}
 