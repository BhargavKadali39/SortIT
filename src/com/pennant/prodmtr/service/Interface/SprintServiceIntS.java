package com.pennant.prodmtr.service.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.ModuleDTO;
import com.pennant.prodmtr.model.Entity.FunctionalUnit;
import com.pennant.prodmtr.model.Entity.Sprint;
import com.pennant.prodmtr.model.Entity.SprintTasks;
import com.pennant.prodmtr.model.Entity.Task;

public interface SprintServiceIntS {
	List<Sprint> getBacklogs();

	Sprint getSprintDetails(int sprintId);

	List<Task> getTasks(int modlId);

	List<Sprint> getAllSprints();

	List<SprintTasks> getAllTasksBySprintId(Integer sprintId);

	void storeSprint(Sprint sprint);

	List<ModuleDTO> getSprintModulesByProjectId(int projectId);

	List<FunctionalUnit> getFunctionalUnitsByModId(int modlId);

	public void storeTask(Task task);
}