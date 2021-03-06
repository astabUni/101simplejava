package org.softlang.company.features.visitor;

import org.softlang.company.model.*;

public interface ReturningVisitor<R> {

    R visit(Company o);
    R visit(Department o);
    R visit(Employee o);

}