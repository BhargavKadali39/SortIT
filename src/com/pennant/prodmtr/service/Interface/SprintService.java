package com.pennant.prodmtr.service.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.ModuleDTO;
import com.pennant.prodmtr.model.Dto.SprintDto;
import com.pennant.prodmtr.model.Entity.FunctionalUnit;
import com.pennant.prodmtr.model.Entity.Sprint;
import com.pennant.prodmtr.model.Entity.SprintTasks;
import com.pennant.prodmtr.model.Entity.Task;
import com.pennant.prodmtr.model.Entity.User;

public interface SprintService {
	Sprint getSprintById(int sprintId);

	List<Sprint> getAllSprints();

	void createSprint(Sprint sprint);

	void updateSprint(Sprint sprint);

	void deleteSprint(int sprintId);

	List<SprintDto> getSprintbyprojectId(Integer projectId);

	List<SprintTasks> getAllTasksBySprintId(Integer sprintId);

	List<Sprint> getBacklogs();

	void storeSprint(Sprint sprint);

	List<ModuleDTO> getSprintModulesByProjectId(int projectId);

	List<FunctionalUnit> getFunctionalUnitsByModId(int modlId);

	public void storeTask(Task task);

	public List<User> getAllUsers();

	public List<Task> getTasks(int modlId);

	public Sprint getSprintDetails(int sprintId);

}
