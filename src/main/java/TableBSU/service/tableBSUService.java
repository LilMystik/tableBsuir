package TableBSU.service;

import TableBSU.TableBSUApi.TableBSUApi;
import org.springframework.stereotype.Service;

@Service
public class tableBSUService {
    TableBSUApi api;
    public tableBSUService(TableBSUApi api) {
        this.api = api;
    }
    public String getGroupData(String groupId) {
        return api.fetchPlayerData(groupId);
    }
}