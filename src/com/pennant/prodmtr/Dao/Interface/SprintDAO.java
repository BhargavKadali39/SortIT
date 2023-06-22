package com.pennant.prodmtr.Dao.Interface;

import java.util.List;

import com.pennant.prodmtr.model.Dto.ModuleDTO;
import com.pennant.prodmtr.model.Dto.SprintDto;
import com.pennant.prodmtr.model.Entity.FunctionalUnit;
import com.pennant.prodmtr.model.Entity.Sprint;
import com.pennant.prodmtr.model.Entity.SprintTasks;
import com.pennant.prodmtr.model.Entity.Task;
import com.pennant.prodmtr.model.Entity.User;

public interface SprintDAO {
	List<Sprint> getBaskLogs();

	Sprint getSprintDetails(int sprintId);

	List<Task> getTasks(int modlId);

	List<Sprint> getAllSprints();

	List<SprintTasks> allTaskBySprintId(Integer sprintId);

	void storeSprint(Sprint sprint);

	List<ModuleDTO> getSprintModulesByProjectId(int projectId);

	List<FunctionalUnit> getFunctionalUnitsByModId(int modl_id);

	public void storeTask(Task task);

	Sprint getSprintById(int sprintId);

	void createSprint(Sprint sprint);

	void updateSprint(Sprint sprint);

	void deleteSprint(int sprintId);

	List<SprintDto> getSprintbyprojectId(Integer projectId);

	List<User> getAllUsers();

	// Add other methods as needed
}