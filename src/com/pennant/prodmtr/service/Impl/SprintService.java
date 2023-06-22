// package com.pennant.prodmtr.service.Impl;
//
// import java.util.List;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
//
// import com.pennant.prodmtr.Dao.Interface.SprintDAO;
// import com.pennant.prodmtr.model.Dto.ModuleDTO;
// import com.pennant.prodmtr.model.Entity.FunctionalUnit;
// import com.pennant.prodmtr.model.Entity.Sprint;
// import com.pennant.prodmtr.model.Entity.SprintTasks;
// import com.pennant.prodmtr.service.Interface.SprintServiceIntS;
//
// @Service
// public class SprintService implements SprintServiceIntS {
// private final SprintDAO sprintDAO;
//
// @Autowired
// public SprintService(SprintDAO sprintDAO) {
// this.sprintDAO = sprintDAO;
// }
//
// @Override
// public List<Sprint> getBacklogs() {
// return sprintDAO.getBaskLogs();
// }
//
// @Override
// public Sprint getSprintDetails(int sprintId) {
// return sprintDAO.getSprintDetails(sprintId);
// }
//
// @Override
// public List<Task> getTasks(int modlId) {
// return sprintDAO.getTasks(modlId);
// }
//
// @Override
// public List<Sprint> getAllSprints() {
// return sprintDAO.getAllSprints();
// }
//
// @Override
// public List<SprintTasks> getAllTasksBySprintId(Integer sprintId) {
// return sprintDAO.allTaskBySprintId(sprintId);
// }
//
// @Override
// public void storeSprint(Sprint sprint) {
// sprintDAO.storeSprint(sprint);
// }
//
// @Override
// public List<ModuleDTO> getSprintModulesByProjectId(int projectId) {
// return sprintDAO.getSprintModulesByProjectId(projectId);
// }
//
// @Override
// public List<FunctionalUnit> getFunctionalUnitsByModId(int modlId) {
// return sprintDAO.getFunctionalUnitsByModId(modlId);
// }
//
// public void storeTask(Task task) {
// sprintDAO.storeTask(task);
// }
// }
