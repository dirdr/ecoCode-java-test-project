package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALL_IN_ONE")
public class ForceLazyFetchTypeUseAllInOne extends LazyItem {
    /**
     * AllInOne class for the default value of FetchType
     * contains false test, compliant code and non-compliant code
     */
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private Set<Order> ordersOneToManyEager = new HashSet<>(); // Non-compliant

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private Set<Order> ordersOneToManyLazy = new HashSet<>(); // Compliant

    @Column(name = "STUDENT_NAME", length = 50, nullable = false)
    private String falseTest; // False test
}