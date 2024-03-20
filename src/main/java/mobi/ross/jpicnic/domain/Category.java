package mobi.ross.jpicnic.domain;

import java.util.*;

record Category (
        String              Type, // `json:"type",
        String              Id, // `json:"id",
        List<Decorator>     Decorators, // `json:"decorators",
        List<Link>          Links, // `json:"links",
        String              Name, // `json:"name",
        List<Category> Items, // `json:"items",
        int                 Level, // `json:"level",
        boolean             IsIncludedInCategoryTree, // `json:"is_included_in_category_tree",
        boolean             Hidden // `json:"hidden"
    ) {}
