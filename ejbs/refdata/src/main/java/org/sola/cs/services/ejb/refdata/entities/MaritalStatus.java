    package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "marital_status", schema = "party")
@DefaultSorter(sortString="display_value")
public class MaritalStatus extends AbstractCodeEntity {
    public MaritalStatus(){
        super();
    }
}
