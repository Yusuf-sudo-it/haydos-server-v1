package iyteyazilim.projects.haydos.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private Long points;

    private String photo;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;

    @OneToMany(mappedBy = "userWhoMiss", cascade = CascadeType.ALL)
    private List<Missing> missingPawsByMe;

    @OneToMany(mappedBy = "userWhoAdopt", cascade = CascadeType.ALL)
    private List<Adoption> adoptionPawsByMe;

    @OneToMany(mappedBy = "userWhoAnnounce", cascade = CascadeType.ALL)
    private List<Announcement> announcementByMe;

    @OneToMany(mappedBy = "userWhoFeed", cascade = CascadeType.ALL)
    private List<Feeding> feedPawsByMe;

    @OneToMany(mappedBy = "userWhoReport", cascade = CascadeType.ALL)
    private List<Reports> reports;

    @ManyToMany
    @JoinTable(
            name = "user_friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id")
    )
    private List<Friends> friends;
}