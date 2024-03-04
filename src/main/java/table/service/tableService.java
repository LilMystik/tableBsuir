package table.service;



import table.tableAPI.tableAPI;
import org.springframework.stereotype.Service;

@Service
public class tableService {
    tableAPI api;
    public tableService(tableAPI api) {
        this.api = api;
    }
    public String getGroupData(String groupId) {
        return api.fetchGroupData(groupId);
    }
}
