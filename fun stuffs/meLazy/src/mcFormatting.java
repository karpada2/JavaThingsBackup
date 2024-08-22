import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class mcFormatting {
    public static void main(String[] args) {
        String[] main = {
                         "aqua_affinity", "arthropod_bane", "blast_prot", "channeling",
                         "binding", "vanishing", "depth_stride", "efficiency",
                         "feather_fall", "fire_aspect", "fire_prot", "flame",
                         "fortune", "frost_walker", "impaling", "infinity",
                         "knockback", "looting", "loyalty", "luck_sea",
                         "lure", "mending", "multishot", "piercing",
                         "power", "projectile_prot", "prot", "punch",
                         "quick_charge", "respiration", "riptide", "sharpness",
                         "silk_touch", "smite", "soul_speed", "sweeping_edge",
                         "swift_sneak", "thorns", "unbreaking"
                        };

        String[] mainActual = {
                "aqua_affinity", "bane_of_arthropods", "blast_protection", "channeling",
                "binding_curse", "vanishing_curse", "depth_strider", "efficiency",
                "feather_falling", "fire_aspect", "fire_protection", "flame",
                "fortune", "frost_walker", "impaling", "infinity",
                "knockback", "looting", "loyalty", "luck_of_the_sea",
                "lure", "mending", "multishot", "piercing",
                "power", "projectile_protection", "protection", "punch",
                "quick_charge", "respiration", "riptide", "sharpness",
                "silk_touch", "smite", "soul_speed", "sweeping",
                "swift_sneak", "thorns", "unbreaking"
        };


        int[] mainToo = {
                         1, 5, 4, 1,
                         1, 1, 3, 5,
                         4, 2, 4, 1,
                         3, 2, 5, 1,
                         2, 3, 3, 3,
                         3, 1, 1, 4,
                         5, 4, 4, 2,
                         3, 3, 3, 5,
                         1, 5, 5, 3,
                         3, 3, 3
                         }; // how many levels each enchant has, fitting

        String[] numberToName = {"error", "one", "two", "three", "four", "five"};


        String absolutePath = "C:\\Users\\gongr\\AppData\\Roaming\\gdlauncher_next\\instances\\1.20.1\\saves\\enchant anything\\datapacks\\enchantAnything\\data\\electrocaruzo\\predicates\\";
        try {
            for (int i = 0; i < main.length; i++) {
                for (int j = 1; j <= mainToo[i]; j++) {
                    FileWriter writeShitter = new FileWriter(absolutePath + "is_holding_" + main[i] + "\\is_holding_" + main[i] + "_" + numberToName[j] + ".json");
                    writeShitter.write("{\n" +
                            "  \"condition\": \"minecraft:entity_properties\",\n" +
                            "  \"entity\": \"this\",\n" +
                            "  \"predicate\": {\n" +
                            "    \"equipment\": {\n" +
                            "      \"offhand\": {\n" +
                            "        \"items\": [\n" +
                            "          \"minecraft:enchanted_book\"\n" +
                            "        ],\n" +
                            "        \"stored_enchantments\": [\n" +
                            "          {\n" +
                            "            \"enchantment\": \"minecraft:" + mainActual[i] + "\",\n" +
                            "            \"levels\": " + j + "\n" +
                            "          }\n" +
                            "        ]\n" +
                            "      }\n" +
                            "    }\n" +
                            "  }\n" +
                            "}\n");
                    writeShitter.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
