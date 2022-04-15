package org.tool.converter;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<WorldCupMatchRecord, WorldCupMatchRecord> {


    @Override
    public WorldCupMatchRecord process(WorldCupMatchRecord worldCupMatchRecord) throws Exception {

        if(checkNull(worldCupMatchRecord)) {
           // System.out.println(worldCupMatchRecord);
            return null;
        }
//        System.out.println(worldCupMatchRecord);
        return worldCupMatchRecord;

    }

    public boolean checkNull(WorldCupMatchRecord worldCupMatchRecord) throws IllegalAccessException {
            if ( worldCupMatchRecord.year !="" && worldCupMatchRecord.datetime !=""&&worldCupMatchRecord.stadium !=""&&worldCupMatchRecord.city !="")
                return false;
        return true;
    }
}
