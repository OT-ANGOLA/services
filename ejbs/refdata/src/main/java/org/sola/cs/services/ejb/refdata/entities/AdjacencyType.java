package org.sola.cs.services.ejb.refdata.entities;

import javax.persistence.Table;
import org.sola.services.common.repository.DefaultSorter;
import org.sola.services.common.repository.entities.AbstractCodeEntity;

@Table(name = "adjacency_type", schema = "opentenure")
@DefaultSorter(sortString="display_value")
public class AdjacencyType extends AbstractCodeEntity {
    public AdjacencyType(){
        super();
    }
}
